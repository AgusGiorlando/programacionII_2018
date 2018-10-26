import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { HttpResponse, HttpErrorResponse } from '@angular/common/http';
import { Observable } from 'rxjs';
import { JhiAlertService } from 'ng-jhipster';

import { IUserdata } from 'app/shared/model/userdata.model';
import { UserdataService } from './userdata.service';
import { IJhi_user } from 'app/shared/model/jhi-user.model';
import { Jhi_userService } from 'app/entities/jhi-user';

@Component({
    selector: 'jhi-userdata-update',
    templateUrl: './userdata-update.component.html'
})
export class UserdataUpdateComponent implements OnInit {
    private _userdata: IUserdata;
    isSaving: boolean;

    jhi_users: IJhi_user[];

    constructor(
        private jhiAlertService: JhiAlertService,
        private userdataService: UserdataService,
        private jhi_userService: Jhi_userService,
        private activatedRoute: ActivatedRoute
    ) {}

    ngOnInit() {
        this.isSaving = false;
        this.activatedRoute.data.subscribe(({ userdata }) => {
            this.userdata = userdata;
        });
        this.jhi_userService.query({ filter: 'userdata-is-null' }).subscribe(
            (res: HttpResponse<IJhi_user[]>) => {
                if (!this.userdata.jhi_user || !this.userdata.jhi_user.id) {
                    this.jhi_users = res.body;
                } else {
                    this.jhi_userService.find(this.userdata.jhi_user.id).subscribe(
                        (subRes: HttpResponse<IJhi_user>) => {
                            this.jhi_users = [subRes.body].concat(res.body);
                        },
                        (subRes: HttpErrorResponse) => this.onError(subRes.message)
                    );
                }
            },
            (res: HttpErrorResponse) => this.onError(res.message)
        );
    }

    previousState() {
        window.history.back();
    }

    save() {
        this.isSaving = true;
        if (this.userdata.id !== undefined) {
            this.subscribeToSaveResponse(this.userdataService.update(this.userdata));
        } else {
            this.subscribeToSaveResponse(this.userdataService.create(this.userdata));
        }
    }

    private subscribeToSaveResponse(result: Observable<HttpResponse<IUserdata>>) {
        result.subscribe((res: HttpResponse<IUserdata>) => this.onSaveSuccess(), (res: HttpErrorResponse) => this.onSaveError());
    }

    private onSaveSuccess() {
        this.isSaving = false;
        this.previousState();
    }

    private onSaveError() {
        this.isSaving = false;
    }

    private onError(errorMessage: string) {
        this.jhiAlertService.error(errorMessage, null, null);
    }

    trackJhi_userById(index: number, item: IJhi_user) {
        return item.id;
    }
    get userdata() {
        return this._userdata;
    }

    set userdata(userdata: IUserdata) {
        this._userdata = userdata;
    }
}
