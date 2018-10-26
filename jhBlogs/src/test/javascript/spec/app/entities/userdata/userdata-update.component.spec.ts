/* tslint:disable max-line-length */
import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { HttpResponse } from '@angular/common/http';
import { Observable, of } from 'rxjs';

import { JhBlogsTestModule } from '../../../test.module';
import { UserdataUpdateComponent } from 'app/entities/userdata/userdata-update.component';
import { UserdataService } from 'app/entities/userdata/userdata.service';
import { Userdata } from 'app/shared/model/userdata.model';

describe('Component Tests', () => {
    describe('Userdata Management Update Component', () => {
        let comp: UserdataUpdateComponent;
        let fixture: ComponentFixture<UserdataUpdateComponent>;
        let service: UserdataService;

        beforeEach(() => {
            TestBed.configureTestingModule({
                imports: [JhBlogsTestModule],
                declarations: [UserdataUpdateComponent]
            })
                .overrideTemplate(UserdataUpdateComponent, '')
                .compileComponents();

            fixture = TestBed.createComponent(UserdataUpdateComponent);
            comp = fixture.componentInstance;
            service = fixture.debugElement.injector.get(UserdataService);
        });

        describe('save', () => {
            it(
                'Should call update service on save for existing entity',
                fakeAsync(() => {
                    // GIVEN
                    const entity = new Userdata(123);
                    spyOn(service, 'update').and.returnValue(of(new HttpResponse({ body: entity })));
                    comp.userdata = entity;
                    // WHEN
                    comp.save();
                    tick(); // simulate async

                    // THEN
                    expect(service.update).toHaveBeenCalledWith(entity);
                    expect(comp.isSaving).toEqual(false);
                })
            );

            it(
                'Should call create service on save for new entity',
                fakeAsync(() => {
                    // GIVEN
                    const entity = new Userdata();
                    spyOn(service, 'create').and.returnValue(of(new HttpResponse({ body: entity })));
                    comp.userdata = entity;
                    // WHEN
                    comp.save();
                    tick(); // simulate async

                    // THEN
                    expect(service.create).toHaveBeenCalledWith(entity);
                    expect(comp.isSaving).toEqual(false);
                })
            );
        });
    });
});
