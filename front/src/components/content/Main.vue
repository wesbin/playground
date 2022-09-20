<script setup>
import Board from '@/components/content/board/Board';

const recentViewBoard = [
  {
    name: '만화'
  },
  {
    name: '음악'
  },
]
</script>

<template>
  <main class="main">
    <section class="board-section">
      <Board :tabs="recentViewBoard"></Board>
    </section>
    <section class="board-section">
      <article class="article">랜덤</article>
      <article class="article">등등</article>
    </section>
    <section class="board-section">
      <article class="article">원하는거</article>
      <article class="article">게시판</article>
      <article class="article">형식으로</article>
    </section>
  </main>
</template>

<style scoped lang="scss">
.main {
  width: 1150px;

  .board-section {
    display: grid;
    grid-template-columns: repeat(auto-fit, minmax(0, 1fr));

    .article {
      height: 300px;
      background-color: bisque;
    }
  }
}
</style>