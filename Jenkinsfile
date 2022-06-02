//定义jenkins流水线
pipeline {
    //定义代理
    agent any

    //定义环境信息
    environment {
      name = "weiliwang"
      address = "重庆市大渡口区"
    }


    //定义流水线的加工流程
    stages {
        stage('编译') {
            steps {
                echo "编译。。。"
            }
        }
        stage('构建') {
            steps {
                echo "构建。。。"
            }
        }
        stage('打包') {
            steps {
                echo "打包。。。"
            }
        }
        stage('部署') {
            steps {
                echo "部署。。。"
            }
        }
    }
}