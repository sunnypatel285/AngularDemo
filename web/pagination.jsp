<!DOCTYPE html >
<html>
    <head>
        <title></title>
        <script type="text/javascript" src="/AngularDemo/js/angular.min.js"></script>
        <script type="text/javascript" src="/AngularDemo/js/ocLazyLoad.js"></script>
    </head>
    <body ng-app="MyApp">
        <div ng-controller="PaginationCtrl">
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Name</th>
                        <th>Description</th>
                    </tr>
                </thead>
                <tbody>
                    <tr ng-repeat="item in items| offset: currentPage * itemsPerPage | limitTo: itemsPerPage">
                        <td>{{item.id}}</td>
                        <td>{{item.name}}</td>
                        <td>{{item.description}}</td>
                    </tr>
                </tbody>
                <tfoot>
                    <td colspan="3">
                        <div class="pagination">
                            <ul>
                                <li ng-class="prevPageDisabled()">
                                    <a href ng-click="prevPage()">« Prev</a>
                                </li>
                                <li ng-repeat="n in range()" ng-class="{active: n == currentPage}" ng-click="setPage(n)">
                                    <a href="#">{{n + 1}}</a>
                                </li>
                                <li ng-class="nextPageDisabled()">
                                    <a href ng-click="nextPage()">Next »</a>
                                </li>
                            </ul>
                        </div>
                    </td>
                </tfoot>
            </table>
        </div>
    </body>
    
    <script type="text/javascript" src="/AngularDemo/js/angular-route.min.js"></script>
    <script type="text/javascript" src="/AngularDemo/js/projectRoute.js"></script>
</html>
<script type="text/javascript">
        var app = angular.module("MyApp", []);

        app.filter('offset', function() {
            return function(input, start) {
                start = parseInt(start, 10);
                return input.slice(start);
            };
        });

        app.controller("PaginationCtrl", function($scope) {

            $scope.itemsPerPage = 5;
            $scope.currentPage = 0;
            $scope.items = [];

            for (var i = 0; i < 50; i++) {
                $scope.items.push({id: i, name: "name " + i, description: "description " + i});
            }

            $scope.range = function() {
                var rangeSize = 5;
                var ret = [];
                var start;

                start = $scope.currentPage;
                if (start > $scope.pageCount() - rangeSize) {
                    start = $scope.pageCount() - rangeSize + 1;
                }

                for (var i = start; i < start + rangeSize; i++) {
                    ret.push(i);
                }
                return ret;
            };

            $scope.prevPage = function() {
                if ($scope.currentPage > 0) {
                    $scope.currentPage--;
                }
            };

            $scope.prevPageDisabled = function() {
                return $scope.currentPage === 0 ? "disabled" : "";
            };

            $scope.pageCount = function() {
                return Math.ceil($scope.items.length / $scope.itemsPerPage) - 1;
            };

            $scope.nextPage = function() {
                if ($scope.currentPage < $scope.pageCount()) {
                    $scope.currentPage++;
                }
            };

            $scope.nextPageDisabled = function() {
                return $scope.currentPage === $scope.pageCount() ? "disabled" : "";
            };

            $scope.setPage = function(n) {
                $scope.currentPage = n;
            };

        });
    </script>
