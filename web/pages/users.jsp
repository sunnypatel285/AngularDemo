<%-- 
    Document   : users
    Created on : 18 Nov, 2015, 12:07:17 PM
    Author     : sunnyp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<meta name="decorator" content="progressnoteTemplate" />
        <div>
            <div ng-controller="userCtrl">
                Name : <input type="text" ng-model="txtName"/>
                Hello, {{txtName}}
                <table border="1">
                    <tr>
                        <td>Id</td>
                        <td>Name</td>
                        <td>Address</td>
                    </tr>
                    <tr ng-repeat="emp in empObj track by $index| filter:txtName">
                        <td>{{emp.id}}</td>
                        <td>{{emp.name| uppercase}}</td>
                        <td>{{emp.Address}}</td>
                    </tr>
                </table>
            </div>
        </div>
