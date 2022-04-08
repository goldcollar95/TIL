쿠버네티스 서버한대는 마스터 나머지는 노드들이 연결이 되어있다. 이것들이 하나의 클러스트 모양이 된다.
클러스트안에 Namespace 라는 공간이 독립적으로 구분되어 있다.
service -> pod(container) -> pod(container)  pod -> volume (volume)은 저장공간을 따로 구비할수있으므로 pod에서 문제가 생겨도 상관없다

controller에는 Replication controller 안에 Pod을 관리할수 있다.
Deployment는 배포후에 새롭게 ReplicaSet을 관리해준다. 
