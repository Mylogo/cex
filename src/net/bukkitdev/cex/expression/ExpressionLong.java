package net.bukkitdev.cex.expression;

import org.bukkit.command.CommandSender;

public class ExpressionLong extends ExpressionPrimitive {

	@Override
	protected String createRegex() {
		return "[0-9]";
	}

	@Override
	protected String createShallRegex() {
		return "<double>";
	}

	@Override
	public boolean isExpressionFor(String commandExpression) {
		return "<double>".equalsIgnoreCase(commandExpression);
	}

	@Override
	public boolean reactsTo(CommandSender sender, String[] p, int index, String enteredCommand) {
		try {
			Long.parseLong(enteredCommand);
			return true;
		} catch(Exception e){
			return false;
		}
	}

	@Override
	public Result react(CommandSender sender, String[] p, int index, String enteredCommand) {
		return new Result(Long.parseLong(enteredCommand));
	}

}
