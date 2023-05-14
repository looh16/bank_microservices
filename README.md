# bank_microservices

A Simple Project to Understand Microservices Architecture Using Spring Boot, Spring Cloud Components, Docker, and Kubernetes.

## Built With

- Java 17
- Spring Boot



## Used Maven Commands

|     Maven Command       |     Description          |
| ------------- | ------------- |
| "mvn clean install -Dmaven.test.skip=true" | To generate a jar inside target folder |
| "mvn spring-boot:run" | To start a springboot maven project |

## Used Docker Commands

|     Docker Command       |     Description          |
| ------------- | ------------- |
| "docker build . -t bank/accounts" | To generate a docker image based on a Dockerfile |
| "docker run  -p 8081:8080 bank/accounts" | To start a docker container based on a given image |
| "docker images" | To list all the docker images present in the Docker server |
| "docker image inspect image-id" | To display detailed image information for a given image id |
| "docker image rm image-id" | To remove one or more images for a given image ids |
  "docker tag bank/accounts:latest looh/accounts:latest" |used to create a new tag for an existing image|
| "docker image push looh/accounts:latest" | To push an image or a repository to a registry |
| "docker image pull looh/accounts:latest" | To pull an image or a repository from a registry |
| "docker ps" | To show all running containers |
| "docker ps -a" | To show all containers including running and stopped |
| "docker container start container-id" | To start one or more stopped containers |
| "docker container pause container-id" | To pause all processes within one or more containers |
| "docker container unpause container-id" | To unpause all processes within one or more containers |
| "docker container stop container-id" | To stop one or more running containers |
| "docker container kill container-id" | To kill one or more running containers instantly |
| "docker container restart container-id" | To restart one or more containers |
| "docker container inspect container-id" | To inspect all the details for a given container id |
| "docker container logs container-id" | To fetch the logs of a given container id |
| "docker container logs -f container-id" | To follow log output of a given container id |
| "docker container rm container-id" | To remove one or more containers based on container ids |
| "docker container prune" | To remove all stopped containers |
| "docker compose up" | To create and start containers based on given docker compose file |
| "docker compose stop" | To stop services |

## Used Kubernetes Commands

|     Kubernetes Command       |     Description          |
| ------------- | ------------- |
| "kubectl apply -f filename" | To create a deployment/service/configmap based on a given YAML file |
| "kubectl get all" | To get all the components inside your cluster |
| "kubectl get pods" | To get all the pods details inside your cluster |
| "kubectl get pod pod-id" | To get the details of a given pod id |
| "kubectl describe pod pod-id" | To get more details of a given pod id |
| "kubectl delete pod pod-id" | To delete a given pod from cluster |
| "kubectl get services" | To get all the services details inside your cluster |
| "kubectl get service service-id" | To get the details of a given service id |
| "kubectl describe service service-id" | To get more details of a given service id |
| "kubectl get nodes" | To get all the node details inside your cluster |
| "kubectl get node node-id" | To get the details of a given node |
| "kubectl get replicasets" | To get all the replica sets details inside your cluster |
| "kubectl get replicaset replicaset-id" | To get the details of a given replicaset |
| "kubectl get deployments" | To get all the deployments details inside your cluster |
| "kubectl get deployment deployment-id" | To get the details of a given deployment |
| "kubectl get configmaps" | To get all the configmap details inside your cluster |
| "kubectl get configmap configmap-id" | To get the details of a given configmap |
| "kubectl get events --sort-by=.metadata.creationTimestamp" | To get all the events occured inside your cluster |
| "kubectl scale deployment accounts-deployment --replicas=3" | To increase the number of replicas for a deployment inside your cluster |
| "kubectl set image deployment accounts-deployment accounts=eazybytes/accounts:k8s" | To set a new image for a deployment inside your cluster |
| "kubectl rollout history deployment accounts-deployment" | To know the rollout history for a deployment inside your cluster |
| "kubectl rollout undo deployment accounts-deployment --to-revision=1" | To rollback to a given revision for a deployment inside your cluster |
| "kubectl autoscale deployment accounts-deployment --min=3 --max=10 --cpu-percent=70" | To create automatic scaling using HPA for a deployment inside your cluster |
| "kubectl logs node-id" | To get a logs of a given node inside your cluster |

## Used Helm Commands

|     Helm Command       |     Description          |
| ------------- | ------------- |
| "helm create [NAME]" | Create a default chart with the given name |
| "helm dependencies build" | To recompile the given helm chart |
| "helm install [NAME] [CHART]" | Install the given helm chart into K8s cluster |
| "helm upgrade [NAME] [CHART]" | Upgrades a specified release to a new version of a chart |
| "helm history [NAME]" | Display historical revisions for a given release |
| "helm rollback [NAME] [REVISION]" | Roll back a release to a previous revision |
| "helm uninstall [NAME]" | Uninstall all of the resources associated with a given release |
| "helm template [NAME] [CHART]" | Render chart templates locally along with the values |
| "helm list" | Lists all of the helm releases inside a K8s cluster |
