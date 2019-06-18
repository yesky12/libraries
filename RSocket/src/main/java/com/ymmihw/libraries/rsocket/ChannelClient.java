package com.ymmihw.libraries.rsocket;

import static com.ymmihw.libraries.rsocket.support.Constants.TCP_PORT;
import com.ymmihw.libraries.rsocket.support.GameController;
import io.rsocket.RSocket;
import io.rsocket.RSocketFactory;
import io.rsocket.transport.netty.client.TcpClientTransport;
import reactor.core.publisher.Flux;

public class ChannelClient {

  private final RSocket socket;
  private final GameController gameController;

  public ChannelClient() {
    this.socket = RSocketFactory.connect()
        .transport(TcpClientTransport.create("localhost", TCP_PORT)).start().block();

    this.gameController = new GameController("Client Player");
  }

  public void playGame() {
    socket.requestChannel(Flux.from(gameController)).doOnNext(gameController::processPayload)
        .blockLast();
  }

  public void dispose() {
    this.socket.dispose();
  }
}
