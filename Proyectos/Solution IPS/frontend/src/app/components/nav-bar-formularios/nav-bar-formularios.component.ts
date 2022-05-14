import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-nav-bar-formularios',
  templateUrl: './nav-bar-formularios.component.html',
  styleUrls: ['./nav-bar-formularios.component.css']
})
export class NavBarFormulariosComponent implements OnInit {

  @Input() titulo:string;

  constructor() {}

  ngOnInit(): void {
  }

}
