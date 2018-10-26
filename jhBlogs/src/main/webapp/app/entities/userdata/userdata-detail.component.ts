import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

import { IUserdata } from 'app/shared/model/userdata.model';

@Component({
    selector: 'jhi-userdata-detail',
    templateUrl: './userdata-detail.component.html'
})
export class UserdataDetailComponent implements OnInit {
    userdata: IUserdata;

    constructor(private activatedRoute: ActivatedRoute) {}

    ngOnInit() {
        this.activatedRoute.data.subscribe(({ userdata }) => {
            this.userdata = userdata;
        });
    }

    previousState() {
        window.history.back();
    }
}
