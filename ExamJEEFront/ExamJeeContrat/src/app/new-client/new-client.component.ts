import {Component, OnInit} from '@angular/core';
import {ClientModel} from '../model/client.model';
import {FormBuilder, FormGroup, ReactiveFormsModule} from '@angular/forms';
import {ClientService} from '../services/client.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-new-client',
  imports: [
    ReactiveFormsModule
  ],
  templateUrl: './new-client.component.html',
  styleUrl: './new-client.component.css'
})
export class NewClientComponent implements OnInit{

  clientFormGroup!:FormGroup;

  constructor(private fb: FormBuilder, private clientService: ClientService, private route : Router) {
  }

  ngOnInit(): void {
    this.clientFormGroup = this.fb.group({
      nom: [''],
      email: ['']
    })
  }

  handleSaveClient() {
    const client: ClientModel = this.clientFormGroup.value;
    this.clientService.saveClient(client).subscribe({
      next: value => {
        this.clientFormGroup.reset();
        this.route.navigateByUrl("/client");
      }
    })
  }
}
