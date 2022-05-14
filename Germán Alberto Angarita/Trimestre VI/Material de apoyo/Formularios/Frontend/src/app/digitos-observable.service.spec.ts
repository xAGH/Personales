import { TestBed } from '@angular/core/testing';

import { DigitosObservableService } from './digitos-observable.service';

describe('DigitosObservableService', () => {
  let service: DigitosObservableService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(DigitosObservableService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
