<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../include/header.jsp" %>
<!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <!-- Content Header (Page header) -->
    <div class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            <h1 class="m-0 text-dark">DashBoard Management</h1>
          </div><!-- /.col -->
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="#">Home</a></li>
              <li class="breadcrumb-item active">Starter Page</li>
            </ol>
          </div><!-- /.col -->
        </div><!-- /.row -->
      </div><!-- /.container-fluid -->
      <div class="col-12">
            <div class="card">
              <div class="card-header">
                <h3 class="card-title">게시판 검색</h3>
                </div>
                </div>
                </div>
                <div class="col-1" style="display:inline-block" >
                        <select class="form-control">
                          <option>--</option>
                        </select>
                        </div>
                        <div class="search" style="display:inline">
     <input type="text"  name= "search_keyword" placeholder="">
<div class="button" style="display:inline">
     <button>검색</button>
</div>
<div class="button" style="display:inline">
     <button>새글쓰기</button>
     </div>
                        </div>
    
</div>
        <div class="col-12">
            <div class="card">
              <div class="card-header">
                <h3 class="card-title">LIST ALL PAGE</h3>

                <div class="card-tools">
                  <div class="input-group input-group-sm" style="width: 150px;">
                    <input type="text" name="table_search" class="form-control float-right" placeholder="Search">

                    <div class="input-group-append">
                      <button type="submit" class="btn btn-default"><i class="fas fa-search"></i></button>
                    </div>
                  </div>
                </div>
              </div>
              <!-- /.card-header -->
              <div class="card-body table-responsive p-0">
                <table class="table table-hover text-nowrap">
                  <thead>
                    <tr>
                      <th>BNO</th>
                      <th>TITLE</th>
                      <th>WRITE</th>
                      <th>REGDATE</th>
                      <th>VIEWCNT</th>
                    </tr>
                  </thead>
                  <tbody>
                    <tr>
                      <td>130</td>
                      <td>홈페이지 오픈 테스트</td>
                      <td>kim ilguk</td>
                      <td><span class="tag tag-success">2019-10-19 08:58</span></td>
                      <td><span class="badge badge-danger right">1</span></td>
                    </tr>
                    <tr>
                      <td>124</td>
                      <td>새로운 글을 넣습니다.</td>
                      <td>user00</td>
                      <td><span class="tag tag-warning">2019-10-19 08:58</span></td>
                      <td><span class="badge badge-danger right">0</span></td>
                    </tr>
                    <tr>
                      <td>123</td>
                      <td>새로운 글을 넣습니다.</td>
                      <td>user00</td>
                      <td><span class="tag tag-primary">2019-10-19 08:58</span></td>
                      <td><span class="badge badge-danger right">0</span></td>
                    </tr>
                    <tr>
                      <td>122</td>
                      <td>새로운 글을 넣습니다.</td>
                      <td>user00</td>
                      <td><span class="tag tag-danger">2019-10-19 08:58</span></td>
                      <td><span class="badge badge-danger right">0</span></td>
                      </tr>
                  </tbody>
            <td> <button type="submit" class="btn btn-primary">CREATE</button>
               </td>
           <td>
              <nav aria-label="Contacts Page Navigation">
            <ul class="pagination justify-content-center m-0">
              <li class="page-item active"><a class="page-link" href="#">1</a></li>
            </ul>
          </nav>
               </td>
                </table>
              </div>
              <!-- /.card-body -->
            </div>
            <!-- /.card -->
          </div>
 
    
    </div>
    <!-- /.content-header -->

<%@include file="../include/footer.jsp" %>