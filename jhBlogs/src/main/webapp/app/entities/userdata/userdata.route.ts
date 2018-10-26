import { Injectable } from '@angular/core';
import { HttpResponse } from '@angular/common/http';
import { Resolve, ActivatedRouteSnapshot, RouterStateSnapshot, Routes } from '@angular/router';
import { UserRouteAccessService } from 'app/core';
import { of } from 'rxjs';
import { map } from 'rxjs/operators';
import { Userdata } from 'app/shared/model/userdata.model';
import { UserdataService } from './userdata.service';
import { UserdataComponent } from './userdata.component';
import { UserdataDetailComponent } from './userdata-detail.component';
import { UserdataUpdateComponent } from './userdata-update.component';
import { UserdataDeletePopupComponent } from './userdata-delete-dialog.component';
import { IUserdata } from 'app/shared/model/userdata.model';

@Injectable({ providedIn: 'root' })
export class UserdataResolve implements Resolve<IUserdata> {
    constructor(private service: UserdataService) {}

    resolve(route: ActivatedRouteSnapshot, state: RouterStateSnapshot) {
        const id = route.params['id'] ? route.params['id'] : null;
        if (id) {
            return this.service.find(id).pipe(map((userdata: HttpResponse<Userdata>) => userdata.body));
        }
        return of(new Userdata());
    }
}

export const userdataRoute: Routes = [
    {
        path: 'userdata',
        component: UserdataComponent,
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Userdata'
        },
        canActivate: [UserRouteAccessService]
    },
    {
        path: 'userdata/:id/view',
        component: UserdataDetailComponent,
        resolve: {
            userdata: UserdataResolve
        },
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Userdata'
        },
        canActivate: [UserRouteAccessService]
    },
    {
        path: 'userdata/new',
        component: UserdataUpdateComponent,
        resolve: {
            userdata: UserdataResolve
        },
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Userdata'
        },
        canActivate: [UserRouteAccessService]
    },
    {
        path: 'userdata/:id/edit',
        component: UserdataUpdateComponent,
        resolve: {
            userdata: UserdataResolve
        },
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Userdata'
        },
        canActivate: [UserRouteAccessService]
    }
];

export const userdataPopupRoute: Routes = [
    {
        path: 'userdata/:id/delete',
        component: UserdataDeletePopupComponent,
        resolve: {
            userdata: UserdataResolve
        },
        data: {
            authorities: ['ROLE_USER'],
            pageTitle: 'Userdata'
        },
        canActivate: [UserRouteAccessService],
        outlet: 'popup'
    }
];
