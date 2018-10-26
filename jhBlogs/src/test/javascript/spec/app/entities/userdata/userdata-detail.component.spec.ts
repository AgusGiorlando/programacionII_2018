/* tslint:disable max-line-length */
import { ComponentFixture, TestBed } from '@angular/core/testing';
import { ActivatedRoute } from '@angular/router';
import { of } from 'rxjs';

import { JhBlogsTestModule } from '../../../test.module';
import { UserdataDetailComponent } from 'app/entities/userdata/userdata-detail.component';
import { Userdata } from 'app/shared/model/userdata.model';

describe('Component Tests', () => {
    describe('Userdata Management Detail Component', () => {
        let comp: UserdataDetailComponent;
        let fixture: ComponentFixture<UserdataDetailComponent>;
        const route = ({ data: of({ userdata: new Userdata(123) }) } as any) as ActivatedRoute;

        beforeEach(() => {
            TestBed.configureTestingModule({
                imports: [JhBlogsTestModule],
                declarations: [UserdataDetailComponent],
                providers: [{ provide: ActivatedRoute, useValue: route }]
            })
                .overrideTemplate(UserdataDetailComponent, '')
                .compileComponents();
            fixture = TestBed.createComponent(UserdataDetailComponent);
            comp = fixture.componentInstance;
        });

        describe('OnInit', () => {
            it('Should call load all on init', () => {
                // GIVEN

                // WHEN
                comp.ngOnInit();

                // THEN
                expect(comp.userdata).toEqual(jasmine.objectContaining({ id: 123 }));
            });
        });
    });
});
