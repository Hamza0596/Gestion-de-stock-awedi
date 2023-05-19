import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SubAssembliesComponent } from './sub-assembly.component';

describe('SubAssemblyComponent', () => {
  let component: SubAssembliesComponent;
  let fixture: ComponentFixture<SubAssembliesComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [SubAssembliesComponent],
    }).compileComponents();

    fixture = TestBed.createComponent(SubAssembliesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
