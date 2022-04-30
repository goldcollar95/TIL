class OwnerController{
  private OwnerRepository repo;
  
  public OwnerController(OwnerRepository repo){
    this.repo = repo;
  }
  
  //repo를 사용합니다.
}

class OwnerControllerTest{
  @Test
  public void create(){
    OwnerRepository repo = new OwnerRepositroy();
    OwnerController controller = new OwnerController(repo);
  }
}
