import {Component, OnInit} from '@angular/core';
import {map, Observable} from 'rxjs';
import {ClientModel} from '../model/client.model';
import {ClientService} from '../services/client.service';
import {AsyncPipe} from '@angular/common';
import {Router} from '@angular/router';

@Component({
  selector: 'app-client',
  imports: [
    AsyncPipe
  ],
  templateUrl: './client.component.html',
  styleUrl: './client.component.css'
})
export class ClientComponent implements OnInit {

  clients!: Observable<ClientModel[]>;


  constructor(private clientService: ClientService, private route: Router) {
  }

  ngOnInit(): void {
    this.getClients();
  }

  getClients() {
    this.clients = this.clientService.getAllClients();
  }


  handleDeleteClient(id: number) {
    this.clientService.deleteClient(id).subscribe({
     next: data => {
       this.clients = this.clients.pipe(
         map(data => data.filter(c => c.id !== id))
       );
     }
    })
  }

  handleShowContrats(client: ClientModel) {
     this.route.navigateByUrl(`/contratsClients/${client.id}`);
  }
}
