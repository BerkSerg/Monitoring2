package out;

import in.Request;
import out.account.User;
import out.db.DataBase;
import out.db.IDao;

public class API implements Iapi{
    private final IDao dao = new DataBase();
    private User currentUser = null;

    @Override
    public Response response(Request request) {
        String mapping = request.getMapping();
        switch (mapping) {
            case "/login" -> {return login(request);}
            case "/register" -> System.out.println("регистрация");
            default -> {return new Response(request.isAuth());}
        }
        return null;
    }

    private Response login(Request request) {
        System.out.println(request);
        String username = request.getValueByKey("username");
        String password = request.getValueByKey("password");
        boolean success = dao.authorize(username, password);
        if (success) {
            currentUser = dao.findUserByUsername(username);
        }
        return new Response(success);
    }
}
