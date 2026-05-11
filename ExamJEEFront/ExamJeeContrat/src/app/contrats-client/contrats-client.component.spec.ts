import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ContratsClientComponent } from './contrats-client.component';

describe('ContratsClientComponent', () => {
  let component: ContratsClientComponent;
  let fixture: ComponentFixture<ContratsClientComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ContratsClientComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ContratsClientComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
