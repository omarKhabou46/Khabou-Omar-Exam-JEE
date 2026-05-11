import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {ClientModel} from '../model/client.model';
import {ContratAssuranceModel} from '../model/ContratAssurance.model';

@Injectable({
  providedIn: 'root'
})
export class ClientService {
  host:string = "http://localhost:9095/api/clients";

  constructor(private http: HttpClient) { }

  getAllClients(): Observable<ClientModel[]> {
    return this.http.get<ClientModel[]>(this.host);
  }

  deleteClient(id: number) {
    return this.http.delete(`${this.host}/${id}`);
  }

  getContratAssuranceById(id: any): Observable<ContratAssuranceModel[]> {
    return this.http.get<ContratAssuranceModel[]>(`${this.host}/${id}/contrats`);
  }
}
