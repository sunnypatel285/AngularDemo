<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
    "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <title></title>
        <script type="text/javascript" src="/AngularDemo/js/angular.min.js"></script>
        <script type="text/javascript" src="/AngularDemo/js/ocLazyLoad.js"></script>
    </head>
    <div id="mainApp">
        <h6>Header</h6>
        <p><b>Navigation</b></p>
        <a href="#/AngularDemo/pages/users.jsp">Users</a>
        <a href="#/AngularDemo/pages/doctors.jsp">Doctors</a>
        <a href="#/AngularDemo/pages/facilties.jsp">Facilities</a>
        <hr />
        <div ng-view ></div>
        <decorator:body />
        <hr />
        <h6>Footer</b></h6>
    </div>
    <script type="text/javascript">

        angular.element(document.getElementById("mainApp")).ready(function() {
            angular.bootstrap(document.getElementById("mainApp"), ["mainApp", "oc.lazyLoad"]);
        });
        angular.module('mainApp', []).config(['$controllerProvider', function($controllerProvider) {
                $controllerProvider.allowGlobals();
            }]);

//        var myApp = angular.module('myApp', ["ngRoute"]);
//        myApp.config(function($controllerProvider, $filterProvider, $compileProvider, $provide) {
//            myApp.register =
//                    {
//                        controller: $controllerProvider.register,
//                        directive: $compileProvider.directive,
//                        filter: $filterProvider.register,
//                        factory: $provide.factory,
//                        service: $provide.service,
//                        constant: $provide.constant
//                    };
//        });
    </script>
        <script type="text/javascript" src="/AngularDemo/js/angular-route.min.js"></script>
        <script type="text/javascript" src="/AngularDemo/js/projectRoute.js"></script>
</html>
