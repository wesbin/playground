<script setup>
import {ref} from 'vue';

const selected = ref(false)
const clickTab = () => selected.value = !selected.value
</script>

<template>
  <div
    class="tab"
    :class="{ selected: selected }"
    @click="clickTab"
  >
    <slot></slot>
  </div>
</template>

<style lang="scss" scoped>
.tab {
  padding: 2px 10px 0 10px;
  margin-bottom: -1px;
  cursor: pointer;
  user-select: none;

  &.selected {
    border-bottom: 2px solid red;
  }
}
</style>