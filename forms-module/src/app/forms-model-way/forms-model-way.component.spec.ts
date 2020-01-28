import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { FormsModelWayComponent } from './forms-model-way.component';

describe('FormsModelWayComponent', () => {
  let component: FormsModelWayComponent;
  let fixture: ComponentFixture<FormsModelWayComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FormsModelWayComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(FormsModelWayComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
