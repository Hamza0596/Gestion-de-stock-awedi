import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CostInformationsComponent } from './cost-informations.component';

describe('CostInformationsComponent', () => {
  let component: CostInformationsComponent;
  let fixture: ComponentFixture<CostInformationsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CostInformationsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CostInformationsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
