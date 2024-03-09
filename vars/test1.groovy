def test1(repo){
  git "https://github.com/intelliqittrainings/${repo}.git"
}
def test2(){
  sh "mvn clean package"
}
  
