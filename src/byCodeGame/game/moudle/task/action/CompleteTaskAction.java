package byCodeGame.game.moudle.task.action;

import org.apache.mina.core.session.IoSession;

import byCodeGame.game.cache.local.RoleCache;
import byCodeGame.game.entity.bo.Role;
import byCodeGame.game.moudle.task.service.TaskService;
import byCodeGame.game.navigation.ActionSupport;
import byCodeGame.game.remote.Message;

public class CompleteTaskAction implements ActionSupport {

	private TaskService taskService;
	public void setTaskService(TaskService taskService) {
		this.taskService = taskService;
	}
	
	@Override
	public void execute(Message message, IoSession session) {
		Role role = RoleCache.getRoleBySession(session);
		int taskId = message.getInt();
		Message msg = taskService.completeTask(role, taskId, session);
		if(msg == null){
			return;
		}else{
			session.write(msg);
		}
	}

}
