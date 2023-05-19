import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ProductionInformationsComponent } from './production-informations.component';

describe('ProductionInformationsComponent', () => {
  let component: ProductionInformationsComponent;
  let fixture: ComponentFixture<ProductionInformationsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ProductionInformationsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ProductionInformationsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
