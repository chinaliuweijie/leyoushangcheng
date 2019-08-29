启动leyou-manager-web 前端程序npm run dev或者npm start
启动nginx服务器：启动：start nginx.exe
停止：nginx.exe -s stop
重新加载：nginx.exe -s reload 在F:\projects\taotaoGithubCode\tools目录下面
fastdfs 启动

启动商城首页项目，运行live-server --port=9002  启动。必须加上9002  访问http://www.leyou.com/


启动elasticsearch,elasticsearch默认不允许以root账号运行。  切换用户:su - leyou
cd /home/leyou/elasticsearch/bin   执行./elasticsearch命令 启动
可以看到绑定了两个端口:

9300：集群节点间通讯接口
9200：客户端访问接口
我们在浏览器中访问：http://192.168.121.132:9200/

window 中装了kibana，在F:\projects\taotaoGithubCode\tools目录下，进入bin目录下，启动kibana.bat。访问http://127.0.0.1:5601





git 提交代码   ---
1.clone自己github上的代码
git clone https://github.com/gubai/gubai.git
5.git pull   拉去代码  更新代码
2.git status查看状态
3.git add *   add代码缓冲区
4.git commit -m "更新说明"      commit只是提交到缓存区域
6.git push origin master   push到远程master分支上
