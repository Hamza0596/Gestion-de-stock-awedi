import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddSubAssemblyDialogComponent } from './add-sub-assembly-dialog.component';

describe('AddSubAssemblyDialogComponent', () => {
  let component: AddSubAssemblyDialogComponent;
  let fixture: ComponentFixture<AddSubAssemblyDialogComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddSubAssemblyDialogComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(AddSubAssemblyDialogComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
