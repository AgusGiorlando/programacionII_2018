import { IJhi_user } from 'app/shared/model/jhi-user.model';

export interface IUserdata {
    id?: number;
    name?: string;
    jhi_user?: IJhi_user;
}

export class Userdata implements IUserdata {
    constructor(public id?: number, public name?: string, public jhi_user?: IJhi_user) {}
}
