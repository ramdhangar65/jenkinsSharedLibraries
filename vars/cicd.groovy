def newGit(repo)
{
  git '${repo}'
}
def newGit(){
  sh 'mvn package'
}
