/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 var mainApp = angular.module('mainApp', ["ngRoute"]);
 mainApp.config(function($routeProvider) {
    $routeProvider
        .when('/AngularDemo/pages/users.jsp', {
        	templateUrl: function(params) {
        		return '/AngularDemo/pages/users.jsp';
        },
        resolve: {
            test: function($ocLazyLoad) {
                return $ocLazyLoad.load({
                    name: 'userModule',
                    files: [
                        '/AngularDemo/pages/users.js'
                    ]
                }).then(function() {
//                    alert('called1');
                }, function(e) {
                    alert(e);
                });
            }
        }
    }).when('/AngularDemo/pages/doctors.jsp', {
        	templateUrl: function(params) {
        		return '/AngularDemo/pages/doctors.jsp';
        },
        resolve: {
            test: function($ocLazyLoad) {
                return $ocLazyLoad.load({
                    name: 'doctorModule',
                    files: [
                        '/AngularDemo/pages/doctors.js'
                    ]
                }).then(function() {
//                    alert('called1');
                }, function(e) {
                    alert(e);
                });
            }
        }
    })
});
