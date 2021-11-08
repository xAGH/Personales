import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-heading',
  templateUrl: './heading.component.html',
  styleUrls: ['./heading.component.scss']
})
export class HeadingComponent implements OnInit {

  constructor() { }

  @Input() title : string = '';
  @Input() subtitle: string = '';

  ngOnInit(): void {
  }

}
