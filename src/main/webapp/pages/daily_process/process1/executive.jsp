<%@ page import="entity.process1.DirectorFormP1" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    @SuppressWarnings("unchecked")
    DirectorFormP1 directorForm = (DirectorFormP1)request.getAttribute("formSubmitted");
%>

<!--TODO: 添加终止功能-->
<html>
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <title>总经理审批</title>
    <meta name="description" content="Grandin is a Dashboard & Admin Site Responsive Template by hencework." />
    <meta name="keywords" content="admin, admin dashboard, admin template, cms, crm, Grandin Admin, Grandinadmin, premium admin templates, responsive admin, sass, panel, software, ui, visualization, web app, application" />
    <meta name="author" content="hencework"/>

    <!--Use c url tags to include static resource files-->
    <!--Make sure to add JSTL dependency before that-->
    <!-- Favicon -->
    <link href="<c:url value="../../../static/img/boc.png"/> " rel="icon" type="image/x-icon">

    <!-- vector map CSS -->
    <link href="<c:url value="../../../static/css/jasny-bootstrap.min.css"/> " rel="stylesheet" type="text/css">

    <!-- Custom CSS -->
    <link href="<c:url value="../../../static/css/style.css"/> " rel="stylesheet" type="text/css"/>
    <link href="<c:url value="https://netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap-glyphicons.css"/> " rel="stylesheet"/>
</head>

<body>
<!--Preloader-->
<div class="preloader-it">
    <div class="la-anim-1"></div>
</div>
<!--/Preloader-->

<div class="wrapper theme-1-active pimary-color-pink">

    <!-- Main Content -->
    <div class="page-wrapper">
        <div class="container-fluid">

            <!-- Row -->
            <div class="row">
                <div class="col-md-12">
                    <div class="panel panel-default card-view">
                        <div class="panel-wrapper collapse in">
                            <div class="panel-body">
                                <div class="row">
                                    <div class="col-sm-12 col-xs-12">
                                        <div class="form-wrap">
                                            <form method="post" action="<c:url value="/daily_process/process1/executive/approve"/> ">
                                                <div class="form-body">
                                                    <h6 class="txt-dark capitalize-font"><i class="glyphicon glyphicon-user"> </i>总经理审批</h6>
                                                    <hr class="light-grey-hr"/>
                                                    <div class="row">
                                                        <div class="col-md-6">
                                                            <div class="form-group">
                                                                <label class="control-label mb-10">申请人姓名</label>
                                                                <input name="applicant_name" type="text" class="form-control" value="<%=directorForm.getApplicant_name()%>" readonly>
                                                            </div>
                                                        </div>
                                                        <!--/span-->
                                                        <div class="col-md-6">
                                                            <div class="form-group">
                                                                <label class="control-label mb-10">申请人EHR号</label>
                                                                <input name="applicant_ehr" type="text" class="form-control" value="<%=directorForm.getApplicant_ehr()%>" readonly>
                                                            </div>
                                                        </div>
                                                        <!--/span-->
                                                    </div>

                                                    <div class="row">
                                                        <div class="col-md-6">
                                                            <div class="form-group">
                                                                <div class="form-group">
                                                                    <label class="control-label mb-10">受分人姓名</label>
                                                                    <input name="recipient_name" type="text" class="form-control" value="<%=directorForm.getRecipient_name()%>" readonly>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <!--/span-->
                                                        <div class="col-md-6">
                                                            <div class="form-group">
                                                                <label class="control-label mb-10">受分人EHR号</label>
                                                                <input name="recipient_ehr" type="text" class="form-control" value="<%=directorForm.getRecipient_ehr()%>" readonly>
                                                            </div>
                                                        </div>
                                                        <!--/span-->
                                                    </div>

                                                    <!-- /Row -->
                                                    <div class="row">
                                                        <div class="col-md-12">
                                                            <div class="form-group">
                                                                <label class="control-label mb-10">积分条目</label>
                                                                <input name="manual_item" type="text" class="form-control" value="<%=directorForm.getManual_item()%>" readonly>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <!-- /Row -->
                                                    <div class="row">

                                                        <div class="col-md-12 ">
                                                            <div class="form-group">
                                                                <label class="control-label mb-10">积分细则</label>
                                                                <input name="manual_detail" type="text" class="form-control" value="<%=directorForm.getManual_detail()%>" readonly>
                                                            </div>
                                                        </div>

                                                    </div>

                                                    <div class="row">

                                                        <div class="col-md-6 ">
                                                            <div class="form-group">
                                                                <label class="control-label mb-10">奖励/减扣分值</label>
                                                                <input name="integral_score" type="text" class="form-control" value="<%=directorForm.getIntegral_score()%>" readonly>
                                                            </div>
                                                        </div>
                                                        <div class="col-md-6 ">
                                                            <div class="form-group">
                                                                <label class="control-label mb-10">地点</label>
                                                                <input name="integral_location" type="text" class="form-control" value="<%=directorForm.getIntegral_location()%>" readonly>
                                                            </div>
                                                        </div>

                                                        <div class="col-md-12 ">
                                                            <div class="form-group">
                                                                <label class="control-label mb-10">积分说明</label>
                                                                <textarea name="integral_description" class="form-control" rows="5" readonly><%=directorForm.getIntegral_description()%></textarea>
                                                            </div>
                                                        </div>

                                                        <div class="col-md-12 ">
                                                            <div class="form-group">
                                                                <label class="control-label mb-10">备注</label>
                                                                <textarea name="integral_remark" class="form-control" rows="5" readonly><%=directorForm.getIntegral_remark()%></textarea>
                                                            </div>
                                                        </div>

                                                        <div class="col-md-12 ">
                                                            <div class="form-group">
                                                                <label class="control-label mb-10">审批意见</label>
                                                                <textarea name="approval_executive_comment" class="form-control" rows="5"></textarea>
                                                            </div>
                                                        </div>

                                                    </div>

                                                </div>
                                                <div class="form-actions mt-10">
                                                    <button type="submit" class="btn btn-success" style="width:80px;">通过</button>
                                                    <a href="<c:url value="/daily_process/process1/executive/reject"/> ">
                                                        <button type="button" class="btn btn-danger" style="width:80px;">退回</button>
                                                    </a>
                                                    <a href="#">
                                                        <button type="button" class="btn btn-default" style="width:80px;">返回</button>
                                                    </a>
                                                </div>
                                            </form>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- /Row -->
        </div>
    </div>
    <!-- /Main Content -->

</div>
<!-- /#wrapper -->

<!-- JavaScript -->

<!-- jQuery -->
<script src="<c:url value="../../../static/js/jquery.min.js"/> "></script>

<!-- Bootstrap Core JavaScript -->
<script src="<c:url value="../../../static/js/bootstrap.min.js"/> "></script>
<script src="<c:url value="../../../static/js/jasny-bootstrap.min.js"/> "></script>

<!-- Slimscroll JavaScript -->
<script src="<c:url value="../../../static/js/jquery.slimscroll.js"/> "></script>

<!-- Fancy Dropdown JS -->
<script src="<c:url value="../../../static/js/dropdown-bootstrap-extended.js"/> "></script>

<!-- Owl JavaScript -->
<script src="<c:url value="../../../static/js/owl.carousel.min.js"/> "></script>

<!-- Switchery JavaScript -->
<script src="<c:url value="../../../static/js/switchery.min.js"/> "></script>

<!-- Init JavaScript -->
<script src="<c:url value="../../../static/js/init.js"/> "></script>
</body>
</html>
