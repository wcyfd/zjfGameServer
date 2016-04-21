package byCodeGame.game.moudle.arms.action;

import org.apache.mina.core.session.IoSession;

import byCodeGame.game.cache.local.RoleCache;
import byCodeGame.game.entity.bo.Role;
import byCodeGame.game.moudle.arms.service.ArmsService;
import byCodeGame.game.navigation.ActionSupport;
import byCodeGame.game.remote.Message;

public class ArmsUpdateHeroSoldierQualityAction implements ActionSupport {
	private ArmsService armsService;

	public void setArmsService(ArmsService armsService) {
		this.armsService = armsService;
	}

	@Override
	public void execute(Message message, IoSession session) {
		Role role = RoleCache.getRoleBySession(session);
		int heroId = message.getInt();
		int propId = message.getInt();
		int requestQuality = message.getInt();
		Message msg = armsService.updateHeroSoldierQuality(role, heroId,propId,requestQuality);
		if (msg == null) {
			return;
		} else {
			session.write(msg);
		}
	}

}