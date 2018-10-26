import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

import { JhBlogsSharedModule } from 'app/shared';
import {
    UserdataComponent,
    UserdataDetailComponent,
    UserdataUpdateComponent,
    UserdataDeletePopupComponent,
    UserdataDeleteDialogComponent,
    userdataRoute,
    userdataPopupRoute
} from './';

const ENTITY_STATES = [...userdataRoute, ...userdataPopupRoute];

@NgModule({
    imports: [JhBlogsSharedModule, RouterModule.forChild(ENTITY_STATES)],
    declarations: [
        UserdataComponent,
        UserdataDetailComponent,
        UserdataUpdateComponent,
        UserdataDeleteDialogComponent,
        UserdataDeletePopupComponent
    ],
    entryComponents: [UserdataComponent, UserdataUpdateComponent, UserdataDeleteDialogComponent, UserdataDeletePopupComponent],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class JhBlogsUserdataModule {}
