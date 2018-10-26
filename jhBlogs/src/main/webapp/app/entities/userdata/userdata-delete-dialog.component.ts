import { Component, OnInit, OnDestroy } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

import { NgbActiveModal, NgbModal, NgbModalRef } from '@ng-bootstrap/ng-bootstrap';
import { JhiEventManager } from 'ng-jhipster';

import { IUserdata } from 'app/shared/model/userdata.model';
import { UserdataService } from './userdata.service';

@Component({
    selector: 'jhi-userdata-delete-dialog',
    templateUrl: './userdata-delete-dialog.component.html'
})
export class UserdataDeleteDialogComponent {
    userdata: IUserdata;

    constructor(private userdataService: UserdataService, public activeModal: NgbActiveModal, private eventManager: JhiEventManager) {}

    clear() {
        this.activeModal.dismiss('cancel');
    }

    confirmDelete(id: number) {
        this.userdataService.delete(id).subscribe(response => {
            this.eventManager.broadcast({
                name: 'userdataListModification',
                content: 'Deleted an userdata'
            });
            this.activeModal.dismiss(true);
        });
    }
}

@Component({
    selector: 'jhi-userdata-delete-popup',
    template: ''
})
export class UserdataDeletePopupComponent implements OnInit, OnDestroy {
    private ngbModalRef: NgbModalRef;

    constructor(private activatedRoute: ActivatedRoute, private router: Router, private modalService: NgbModal) {}

    ngOnInit() {
        this.activatedRoute.data.subscribe(({ userdata }) => {
            setTimeout(() => {
                this.ngbModalRef = this.modalService.open(UserdataDeleteDialogComponent as Component, { size: 'lg', backdrop: 'static' });
                this.ngbModalRef.componentInstance.userdata = userdata;
                this.ngbModalRef.result.then(
                    result => {
                        this.router.navigate([{ outlets: { popup: null } }], { replaceUrl: true, queryParamsHandling: 'merge' });
                        this.ngbModalRef = null;
                    },
                    reason => {
                        this.router.navigate([{ outlets: { popup: null } }], { replaceUrl: true, queryParamsHandling: 'merge' });
                        this.ngbModalRef = null;
                    }
                );
            }, 0);
        });
    }

    ngOnDestroy() {
        this.ngbModalRef = null;
    }
}
