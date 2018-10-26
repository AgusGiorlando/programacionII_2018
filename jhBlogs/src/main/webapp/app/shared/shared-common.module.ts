import { NgModule } from '@angular/core';

import { JhBlogsSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent } from './';

@NgModule({
    imports: [JhBlogsSharedLibsModule],
    declarations: [JhiAlertComponent, JhiAlertErrorComponent],
    exports: [JhBlogsSharedLibsModule, JhiAlertComponent, JhiAlertErrorComponent]
})
export class JhBlogsSharedCommonModule {}
