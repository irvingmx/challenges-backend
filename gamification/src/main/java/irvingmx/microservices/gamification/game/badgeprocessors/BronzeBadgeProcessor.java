package irvingmx.microservices.gamification.game.badgeprocessors;


import irvingmx.microservices.gamification.challenge.ChallengeSolvedEvent;
import irvingmx.microservices.gamification.game.domain.BadgeType;
import irvingmx.microservices.gamification.game.domain.ScoreCard;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
class BronzeBadgeProcessor implements BadgeProcessor {

    @Override
    public Optional<BadgeType> processForOptionalBadge(int currentScore,
                                                       List<ScoreCard> scoreCardList,
                                                       ChallengeSolvedEvent solved) {
        return currentScore > 50 ?
                Optional.of(BadgeType.BRONZE) :
                Optional.empty();
    }

    @Override
    public BadgeType badgeType() {
        return BadgeType.BRONZE;
    }
}
