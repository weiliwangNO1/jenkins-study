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
        stage('环境检查') {
            steps {
                //输出环境变量
                sh 'printenv'
                //输出java版本
                sh 'java -version'
                //输出git版本
                sh 'git --version'
                //输出docker版本
                sh 'docker version'
                //输出maven版本
                sh 'mvn -v'
            }
        }
        stage('编译') {
            steps {
                echo "编译。。。"
                echo "$name"
                echo "address"
                //当前路径以及目录下的文件信息
                sh 'pwd && ls -alh'
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