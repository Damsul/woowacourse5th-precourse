package lotto.view;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class OutputViewTest {
    @Test
    @DisplayName("로또 목록 출력 결과")
    public void lotto() {
        // given
        LottoTickets lottoTickets = new LottoTickets(3);

        // when
        OutputView.printTicket(lottoTickets);

        // then
    }
}