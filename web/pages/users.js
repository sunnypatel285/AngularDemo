/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var saveUser = angular.module('userModule', []);
saveUser.controller("userCtrl", function($scope) {
    $scope.array = [];
    $scope.txtName = "Sunny";
    $scope.empObj = [{id: 1, name: "Sunny", Address: "AD0"}, {id: 2, name: "Lakhu", Address: "AD1"}, {id: 3, name: "Dasharath", Address: "AD2"}, {id: 4, name: "Hardik", Address: "AD3"}];
});
