# coal煤炭交易平台说明 

1.基于SSM框架实现。 

2.功能模块：用户登录，用户管理，采购申请，采购审核等。 

3.使用HttpSession保存用户登录状态，用户类型有平台管理员，公司员工（申请人），公司经理（审核人）， 不同角色拥有不同的功能（权限），

  比如只有个平台管理员才能添加删除用户，再如审核人查看不到申请人未提交的采购记录（状态为草稿）。 
