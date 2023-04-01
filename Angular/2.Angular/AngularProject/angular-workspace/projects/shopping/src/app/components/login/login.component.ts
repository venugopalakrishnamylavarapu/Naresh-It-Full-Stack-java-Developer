import {Component} from "@angular/core";
/*example of code behind Technique of creating component

Note: In code behind technique @Component() directive will use
                a) templateUrl : " "
                b) styleUrls  : [ ]
        In inline technique  @Component() uses
                a) template : ""
                b) styles    : []

*/
@Component({
    selector:'app-login',
    templateUrl:'./login.component.html',
    styleUrls:['./login.component.css']
})
export class LoginComponent{
}