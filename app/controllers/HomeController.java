package controllers;

import play.mvc.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
//        return ok(index.render("Your new application is ready."));
        return ok("Hello Play~").as("text/html");
//        return badRequest("bad request"); // 400, 坏请求
//        return unauthorized("You are forbidden"); // 401, 未授权
//        return redirect("/count");    // 303, 重新定向
//        return status(200, "good");
    }

    public Result newAction() {
        String title = "Play";
        String content = "Hello World! Parameters passed.";
//        return ok("See you!");
        return ok(index.render(title, content));
    }


}
