import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { NavlinkBarComponent } from './navlink-bar.component';

describe('NavlinkBarComponent', () => {
  let component: NavlinkBarComponent;
  let fixture: ComponentFixture<NavlinkBarComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ NavlinkBarComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(NavlinkBarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
