package lotto.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class LottoTickets {
    private final List<LottoNumbers> lottoTickets = new ArrayList<>();

    public LottoTickets(int count) {
        generateTickets(count);
    }

    private void generateTickets(int count) {
        for (int i = 0; i < count; i++) {
            lottoTickets.add(new LottoNumbers());
        }
    }

    public List<LottoNumbers> getLottoTickets() {
        return lottoTickets;
    }

    public WinningResult calculateWinningStatistic(WinningNumbers winningNumbers) {
        List<Ranking> rankings = lottoTickets.stream()
            .map(winningNumbers::calculateRanking)
            .filter(Optional::isPresent)
            .map(Optional::get)
            .collect(Collectors.toList());
        return new WinningResult(rankings);
    }
}