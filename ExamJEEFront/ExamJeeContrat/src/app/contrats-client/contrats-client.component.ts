import {Component, OnInit} from '@angular/core';
import {ActivatedRoute} from '@angular/router';
import {ContratAssuranceModel} from '../model/ContratAssurance.model';
import {Observable} from 'rxjs';
import {ClientService} from '../services/client.service';
import {AsyncPipe} from '@angular/common';

@Component({
  selector: 'app-contrats-client',
  imports: [
    AsyncPipe
  ],
  templateUrl: './contrats-client.component.html',
  styleUrl: './contrats-client.component.css'
})
export class ContratsClientComponent implements OnInit {

  id!: number;
  contarts!: Observable<ContratAssuranceModel[]>;

  constructor(private route: ActivatedRoute, private clientService: ClientService) {
  }

  ngOnInit(): void {

    this.id = this.route.snapshot.params['id'];

    this.getContratsByClientsId(this.id);
  }

  getContratsByClientsId(id: any) {
     this.contarts = this.clientService.getContratAssuranceById(id);
  }



}
