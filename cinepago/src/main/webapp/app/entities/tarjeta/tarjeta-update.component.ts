import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { HttpResponse, HttpErrorResponse } from '@angular/common/http';
import { Observable } from 'rxjs';
import * as moment from 'moment';
import { DATE_TIME_FORMAT } from 'app/shared/constants/input.constants';
import { JhiAlertService } from 'ng-jhipster';

import { ITarjeta } from 'app/shared/model/tarjeta.model';
import { TarjetaService } from './tarjeta.service';
import { ICliente } from 'app/shared/model/cliente.model';
import { ClienteService } from 'app/entities/cliente';

@Component({
    selector: 'jhi-tarjeta-update',
    templateUrl: './tarjeta-update.component.html'
})
export class TarjetaUpdateComponent implements OnInit {
    private _tarjeta: ITarjeta;
    isSaving: boolean;

    clientes: ICliente[];
    created: string;
    updated: string;

    constructor(
        private jhiAlertService: JhiAlertService,
        private tarjetaService: TarjetaService,
        private clienteService: ClienteService,
        private activatedRoute: ActivatedRoute
    ) {}

    ngOnInit() {
        this.isSaving = false;
        this.activatedRoute.data.subscribe(({ tarjeta }) => {
            this.tarjeta = tarjeta;
        });
        this.clienteService.query().subscribe(
            (res: HttpResponse<ICliente[]>) => {
                this.clientes = res.body;
            },
            (res: HttpErrorResponse) => this.onError(res.message)
        );
    }

    previousState() {
        window.history.back();
    }

    save() {
        this.isSaving = true;
        this.tarjeta.created = moment(this.created, DATE_TIME_FORMAT);
        this.tarjeta.updated = moment(this.updated, DATE_TIME_FORMAT);
        if (this.tarjeta.id !== undefined) {
            this.subscribeToSaveResponse(this.tarjetaService.update(this.tarjeta));
        } else {
            this.subscribeToSaveResponse(this.tarjetaService.create(this.tarjeta));
        }
    }

    private subscribeToSaveResponse(result: Observable<HttpResponse<ITarjeta>>) {
        result.subscribe((res: HttpResponse<ITarjeta>) => this.onSaveSuccess(), (res: HttpErrorResponse) => this.onSaveError());
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

    trackClienteById(index: number, item: ICliente) {
        return item.id;
    }
    get tarjeta() {
        return this._tarjeta;
    }

    set tarjeta(tarjeta: ITarjeta) {
        this._tarjeta = tarjeta;
        this.created = moment(tarjeta.created).format(DATE_TIME_FORMAT);
        this.updated = moment(tarjeta.updated).format(DATE_TIME_FORMAT);
    }
}
