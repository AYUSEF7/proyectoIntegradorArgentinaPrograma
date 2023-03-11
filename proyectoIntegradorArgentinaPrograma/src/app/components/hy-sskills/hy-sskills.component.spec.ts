import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HySskillsComponent } from './hy-sskills.component';

describe('HySskillsComponent', () => {
  let component: HySskillsComponent;
  let fixture: ComponentFixture<HySskillsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HySskillsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(HySskillsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
