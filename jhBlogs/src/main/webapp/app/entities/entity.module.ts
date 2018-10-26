import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';

import { JhBlogsAuthorModule } from './author/author.module';
import { JhBlogsBookModule } from './book/book.module';
import { JhBlogsUserdataModule } from './userdata/userdata.module';
/* jhipster-needle-add-entity-module-import - JHipster will add entity modules imports here */

@NgModule({
    // prettier-ignore
    imports: [
        JhBlogsAuthorModule,
        JhBlogsBookModule,
        JhBlogsUserdataModule,
        /* jhipster-needle-add-entity-module - JHipster will add entity modules here */
    ],
    declarations: [],
    entryComponents: [],
    providers: [],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class JhBlogsEntityModule {}
