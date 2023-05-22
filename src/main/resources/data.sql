/**애플리케이션이 구동하면 사용자 정보를 저장할 수 있도록
  application.yml에
    jpa:
    defer-datasource-initialization: true
  항목이 있어야 초기값 설정 가능
  **/
insert into account_user(id, name,created_at,updated_at)
values (1,'Pororo', now(), now());
insert into account_user(id, name,created_at,updated_at)
values (2,'Lupi', now(), now());
insert into account_user(id, name,created_at,updated_at)
values (3,'Eddie', now(), now());