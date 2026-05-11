import { Routes } from '@angular/router';
import {ClientComponent} from './client/client.component';
import {ContratsClientComponent} from './contrats-client/contrats-client.component';
import {NewClientComponent} from './new-client/new-client.component';

export const routes: Routes = [
  {path: "client", component: ClientComponent},
  {path: "", redirectTo: "client", pathMatch: "full"},
  {path: "contratsClients/:id", component: ContratsClientComponent},
  {path: "newClient", component: NewClientComponent}
];
